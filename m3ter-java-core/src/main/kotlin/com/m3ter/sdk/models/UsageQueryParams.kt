// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.m3ter.sdk.core.BaseDeserializer
import com.m3ter.sdk.core.BaseSerializer
import com.m3ter.sdk.core.Enum
import com.m3ter.sdk.core.ExcludeMissing
import com.m3ter.sdk.core.JsonField
import com.m3ter.sdk.core.JsonMissing
import com.m3ter.sdk.core.JsonValue
import com.m3ter.sdk.core.NoAutoDetect
import com.m3ter.sdk.core.Params
import com.m3ter.sdk.core.checkKnown
import com.m3ter.sdk.core.checkRequired
import com.m3ter.sdk.core.getOrThrow
import com.m3ter.sdk.core.http.Headers
import com.m3ter.sdk.core.http.QueryParams
import com.m3ter.sdk.core.immutableEmptyMap
import com.m3ter.sdk.core.toImmutable
import com.m3ter.sdk.errors.M3terInvalidDataException
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

/** Query and filter usage data */
class UsageQueryParams
private constructor(
    private val orgId: String,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun orgId(): String = orgId

    /**
     * ISO 8601 formatted end date to filter by.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun endDate(): OffsetDateTime = body.endDate()

    /**
     * ISO 8601 formatted start date to filter by.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun startDate(): OffsetDateTime = body.startDate()

    /**
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun accountIds(): Optional<List<String>> = body.accountIds()

    /**
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun aggregations(): Optional<List<Aggregation>> = body.aggregations()

    /**
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dimensionFilters(): Optional<List<DimensionFilter>> = body.dimensionFilters()

    /**
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun groups(): Optional<List<Group>> = body.groups()

    /**
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun limit(): Optional<Long> = body.limit()

    /**
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun meterIds(): Optional<List<String>> = body.meterIds()

    /**
     * Returns the raw JSON value of [endDate].
     *
     * Unlike [endDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _endDate(): JsonField<OffsetDateTime> = body._endDate()

    /**
     * Returns the raw JSON value of [startDate].
     *
     * Unlike [startDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _startDate(): JsonField<OffsetDateTime> = body._startDate()

    /**
     * Returns the raw JSON value of [accountIds].
     *
     * Unlike [accountIds], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _accountIds(): JsonField<List<String>> = body._accountIds()

    /**
     * Returns the raw JSON value of [aggregations].
     *
     * Unlike [aggregations], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _aggregations(): JsonField<List<Aggregation>> = body._aggregations()

    /**
     * Returns the raw JSON value of [dimensionFilters].
     *
     * Unlike [dimensionFilters], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _dimensionFilters(): JsonField<List<DimensionFilter>> = body._dimensionFilters()

    /**
     * Returns the raw JSON value of [groups].
     *
     * Unlike [groups], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _groups(): JsonField<List<Group>> = body._groups()

    /**
     * Returns the raw JSON value of [limit].
     *
     * Unlike [limit], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _limit(): JsonField<Long> = body._limit()

    /**
     * Returns the raw JSON value of [meterIds].
     *
     * Unlike [meterIds], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _meterIds(): JsonField<List<String>> = body._meterIds()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    @JvmSynthetic internal fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> orgId
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class Body
    @JsonCreator
    private constructor(
        @JsonProperty("endDate")
        @ExcludeMissing
        private val endDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("startDate")
        @ExcludeMissing
        private val startDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("accountIds")
        @ExcludeMissing
        private val accountIds: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("aggregations")
        @ExcludeMissing
        private val aggregations: JsonField<List<Aggregation>> = JsonMissing.of(),
        @JsonProperty("dimensionFilters")
        @ExcludeMissing
        private val dimensionFilters: JsonField<List<DimensionFilter>> = JsonMissing.of(),
        @JsonProperty("groups")
        @ExcludeMissing
        private val groups: JsonField<List<Group>> = JsonMissing.of(),
        @JsonProperty("limit")
        @ExcludeMissing
        private val limit: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("meterIds")
        @ExcludeMissing
        private val meterIds: JsonField<List<String>> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * ISO 8601 formatted end date to filter by.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun endDate(): OffsetDateTime = endDate.getRequired("endDate")

        /**
         * ISO 8601 formatted start date to filter by.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun startDate(): OffsetDateTime = startDate.getRequired("startDate")

        /**
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun accountIds(): Optional<List<String>> =
            Optional.ofNullable(accountIds.getNullable("accountIds"))

        /**
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun aggregations(): Optional<List<Aggregation>> =
            Optional.ofNullable(aggregations.getNullable("aggregations"))

        /**
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun dimensionFilters(): Optional<List<DimensionFilter>> =
            Optional.ofNullable(dimensionFilters.getNullable("dimensionFilters"))

        /**
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun groups(): Optional<List<Group>> = Optional.ofNullable(groups.getNullable("groups"))

        /**
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun limit(): Optional<Long> = Optional.ofNullable(limit.getNullable("limit"))

        /**
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun meterIds(): Optional<List<String>> =
            Optional.ofNullable(meterIds.getNullable("meterIds"))

        /**
         * Returns the raw JSON value of [endDate].
         *
         * Unlike [endDate], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("endDate") @ExcludeMissing fun _endDate(): JsonField<OffsetDateTime> = endDate

        /**
         * Returns the raw JSON value of [startDate].
         *
         * Unlike [startDate], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("startDate")
        @ExcludeMissing
        fun _startDate(): JsonField<OffsetDateTime> = startDate

        /**
         * Returns the raw JSON value of [accountIds].
         *
         * Unlike [accountIds], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("accountIds")
        @ExcludeMissing
        fun _accountIds(): JsonField<List<String>> = accountIds

        /**
         * Returns the raw JSON value of [aggregations].
         *
         * Unlike [aggregations], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("aggregations")
        @ExcludeMissing
        fun _aggregations(): JsonField<List<Aggregation>> = aggregations

        /**
         * Returns the raw JSON value of [dimensionFilters].
         *
         * Unlike [dimensionFilters], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("dimensionFilters")
        @ExcludeMissing
        fun _dimensionFilters(): JsonField<List<DimensionFilter>> = dimensionFilters

        /**
         * Returns the raw JSON value of [groups].
         *
         * Unlike [groups], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("groups") @ExcludeMissing fun _groups(): JsonField<List<Group>> = groups

        /**
         * Returns the raw JSON value of [limit].
         *
         * Unlike [limit], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("limit") @ExcludeMissing fun _limit(): JsonField<Long> = limit

        /**
         * Returns the raw JSON value of [meterIds].
         *
         * Unlike [meterIds], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("meterIds")
        @ExcludeMissing
        fun _meterIds(): JsonField<List<String>> = meterIds

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            endDate()
            startDate()
            accountIds()
            aggregations().ifPresent { it.forEach { it.validate() } }
            dimensionFilters().ifPresent { it.forEach { it.validate() } }
            groups().ifPresent { it.forEach { it.validate() } }
            limit()
            meterIds()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```java
             * .endDate()
             * .startDate()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var endDate: JsonField<OffsetDateTime>? = null
            private var startDate: JsonField<OffsetDateTime>? = null
            private var accountIds: JsonField<MutableList<String>>? = null
            private var aggregations: JsonField<MutableList<Aggregation>>? = null
            private var dimensionFilters: JsonField<MutableList<DimensionFilter>>? = null
            private var groups: JsonField<MutableList<Group>>? = null
            private var limit: JsonField<Long> = JsonMissing.of()
            private var meterIds: JsonField<MutableList<String>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                endDate = body.endDate
                startDate = body.startDate
                accountIds = body.accountIds.map { it.toMutableList() }
                aggregations = body.aggregations.map { it.toMutableList() }
                dimensionFilters = body.dimensionFilters.map { it.toMutableList() }
                groups = body.groups.map { it.toMutableList() }
                limit = body.limit
                meterIds = body.meterIds.map { it.toMutableList() }
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** ISO 8601 formatted end date to filter by. */
            fun endDate(endDate: OffsetDateTime) = endDate(JsonField.of(endDate))

            /**
             * Sets [Builder.endDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.endDate] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun endDate(endDate: JsonField<OffsetDateTime>) = apply { this.endDate = endDate }

            /** ISO 8601 formatted start date to filter by. */
            fun startDate(startDate: OffsetDateTime) = startDate(JsonField.of(startDate))

            /**
             * Sets [Builder.startDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.startDate] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun startDate(startDate: JsonField<OffsetDateTime>) = apply {
                this.startDate = startDate
            }

            fun accountIds(accountIds: List<String>) = accountIds(JsonField.of(accountIds))

            /**
             * Sets [Builder.accountIds] to an arbitrary JSON value.
             *
             * You should usually call [Builder.accountIds] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun accountIds(accountIds: JsonField<List<String>>) = apply {
                this.accountIds = accountIds.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [accountIds].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addAccountId(accountId: String) = apply {
                accountIds =
                    (accountIds ?: JsonField.of(mutableListOf())).also {
                        checkKnown("accountIds", it).add(accountId)
                    }
            }

            fun aggregations(aggregations: List<Aggregation>) =
                aggregations(JsonField.of(aggregations))

            /**
             * Sets [Builder.aggregations] to an arbitrary JSON value.
             *
             * You should usually call [Builder.aggregations] with a well-typed `List<Aggregation>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun aggregations(aggregations: JsonField<List<Aggregation>>) = apply {
                this.aggregations = aggregations.map { it.toMutableList() }
            }

            /**
             * Adds a single [Aggregation] to [aggregations].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addAggregation(aggregation: Aggregation) = apply {
                aggregations =
                    (aggregations ?: JsonField.of(mutableListOf())).also {
                        checkKnown("aggregations", it).add(aggregation)
                    }
            }

            fun dimensionFilters(dimensionFilters: List<DimensionFilter>) =
                dimensionFilters(JsonField.of(dimensionFilters))

            /**
             * Sets [Builder.dimensionFilters] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dimensionFilters] with a well-typed
             * `List<DimensionFilter>` value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun dimensionFilters(dimensionFilters: JsonField<List<DimensionFilter>>) = apply {
                this.dimensionFilters = dimensionFilters.map { it.toMutableList() }
            }

            /**
             * Adds a single [DimensionFilter] to [dimensionFilters].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addDimensionFilter(dimensionFilter: DimensionFilter) = apply {
                dimensionFilters =
                    (dimensionFilters ?: JsonField.of(mutableListOf())).also {
                        checkKnown("dimensionFilters", it).add(dimensionFilter)
                    }
            }

            fun groups(groups: List<Group>) = groups(JsonField.of(groups))

            /**
             * Sets [Builder.groups] to an arbitrary JSON value.
             *
             * You should usually call [Builder.groups] with a well-typed `List<Group>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun groups(groups: JsonField<List<Group>>) = apply {
                this.groups = groups.map { it.toMutableList() }
            }

            /**
             * Adds a single [Group] to [groups].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addGroup(group: Group) = apply {
                groups =
                    (groups ?: JsonField.of(mutableListOf())).also {
                        checkKnown("groups", it).add(group)
                    }
            }

            /**
             * Alias for calling [addGroup] with `Group.ofDataExplorerAccount(dataExplorerAccount)`.
             */
            fun addGroup(dataExplorerAccount: Group.DataExplorerAccountGroup) =
                addGroup(Group.ofDataExplorerAccount(dataExplorerAccount))

            /**
             * Alias for calling [addGroup] with
             * `Group.ofDataExplorerDimension(dataExplorerDimension)`.
             */
            fun addGroup(dataExplorerDimension: Group.DataExplorerDimensionGroup) =
                addGroup(Group.ofDataExplorerDimension(dataExplorerDimension))

            /** Alias for calling [addGroup] with `Group.ofDataExplorerTime(dataExplorerTime)`. */
            fun addGroup(dataExplorerTime: Group.DataExplorerTimeGroup) =
                addGroup(Group.ofDataExplorerTime(dataExplorerTime))

            fun limit(limit: Long) = limit(JsonField.of(limit))

            /**
             * Sets [Builder.limit] to an arbitrary JSON value.
             *
             * You should usually call [Builder.limit] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun limit(limit: JsonField<Long>) = apply { this.limit = limit }

            fun meterIds(meterIds: List<String>) = meterIds(JsonField.of(meterIds))

            /**
             * Sets [Builder.meterIds] to an arbitrary JSON value.
             *
             * You should usually call [Builder.meterIds] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun meterIds(meterIds: JsonField<List<String>>) = apply {
                this.meterIds = meterIds.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [meterIds].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addMeterId(meterId: String) = apply {
                meterIds =
                    (meterIds ?: JsonField.of(mutableListOf())).also {
                        checkKnown("meterIds", it).add(meterId)
                    }
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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .endDate()
             * .startDate()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("endDate", endDate),
                    checkRequired("startDate", startDate),
                    (accountIds ?: JsonMissing.of()).map { it.toImmutable() },
                    (aggregations ?: JsonMissing.of()).map { it.toImmutable() },
                    (dimensionFilters ?: JsonMissing.of()).map { it.toImmutable() },
                    (groups ?: JsonMissing.of()).map { it.toImmutable() },
                    limit,
                    (meterIds ?: JsonMissing.of()).map { it.toImmutable() },
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Body && endDate == other.endDate && startDate == other.startDate && accountIds == other.accountIds && aggregations == other.aggregations && dimensionFilters == other.dimensionFilters && groups == other.groups && limit == other.limit && meterIds == other.meterIds && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(endDate, startDate, accountIds, aggregations, dimensionFilters, groups, limit, meterIds, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{endDate=$endDate, startDate=$startDate, accountIds=$accountIds, aggregations=$aggregations, dimensionFilters=$dimensionFilters, groups=$groups, limit=$limit, meterIds=$meterIds, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [UsageQueryParams].
         *
         * The following fields are required:
         * ```java
         * .orgId()
         * .endDate()
         * .startDate()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [UsageQueryParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var orgId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(usageQueryParams: UsageQueryParams) = apply {
            orgId = usageQueryParams.orgId
            body = usageQueryParams.body.toBuilder()
            additionalHeaders = usageQueryParams.additionalHeaders.toBuilder()
            additionalQueryParams = usageQueryParams.additionalQueryParams.toBuilder()
        }

        fun orgId(orgId: String) = apply { this.orgId = orgId }

        /** ISO 8601 formatted end date to filter by. */
        fun endDate(endDate: OffsetDateTime) = apply { body.endDate(endDate) }

        /**
         * Sets [Builder.endDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.endDate] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun endDate(endDate: JsonField<OffsetDateTime>) = apply { body.endDate(endDate) }

        /** ISO 8601 formatted start date to filter by. */
        fun startDate(startDate: OffsetDateTime) = apply { body.startDate(startDate) }

        /**
         * Sets [Builder.startDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.startDate] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun startDate(startDate: JsonField<OffsetDateTime>) = apply { body.startDate(startDate) }

        fun accountIds(accountIds: List<String>) = apply { body.accountIds(accountIds) }

        /**
         * Sets [Builder.accountIds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accountIds] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun accountIds(accountIds: JsonField<List<String>>) = apply { body.accountIds(accountIds) }

        /**
         * Adds a single [String] to [accountIds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAccountId(accountId: String) = apply { body.addAccountId(accountId) }

        fun aggregations(aggregations: List<Aggregation>) = apply {
            body.aggregations(aggregations)
        }

        /**
         * Sets [Builder.aggregations] to an arbitrary JSON value.
         *
         * You should usually call [Builder.aggregations] with a well-typed `List<Aggregation>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun aggregations(aggregations: JsonField<List<Aggregation>>) = apply {
            body.aggregations(aggregations)
        }

        /**
         * Adds a single [Aggregation] to [aggregations].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAggregation(aggregation: Aggregation) = apply { body.addAggregation(aggregation) }

        fun dimensionFilters(dimensionFilters: List<DimensionFilter>) = apply {
            body.dimensionFilters(dimensionFilters)
        }

        /**
         * Sets [Builder.dimensionFilters] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dimensionFilters] with a well-typed
         * `List<DimensionFilter>` value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun dimensionFilters(dimensionFilters: JsonField<List<DimensionFilter>>) = apply {
            body.dimensionFilters(dimensionFilters)
        }

        /**
         * Adds a single [DimensionFilter] to [dimensionFilters].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addDimensionFilter(dimensionFilter: DimensionFilter) = apply {
            body.addDimensionFilter(dimensionFilter)
        }

        fun groups(groups: List<Group>) = apply { body.groups(groups) }

        /**
         * Sets [Builder.groups] to an arbitrary JSON value.
         *
         * You should usually call [Builder.groups] with a well-typed `List<Group>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun groups(groups: JsonField<List<Group>>) = apply { body.groups(groups) }

        /**
         * Adds a single [Group] to [groups].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addGroup(group: Group) = apply { body.addGroup(group) }

        /** Alias for calling [addGroup] with `Group.ofDataExplorerAccount(dataExplorerAccount)`. */
        fun addGroup(dataExplorerAccount: Group.DataExplorerAccountGroup) = apply {
            body.addGroup(dataExplorerAccount)
        }

        /**
         * Alias for calling [addGroup] with `Group.ofDataExplorerDimension(dataExplorerDimension)`.
         */
        fun addGroup(dataExplorerDimension: Group.DataExplorerDimensionGroup) = apply {
            body.addGroup(dataExplorerDimension)
        }

        /** Alias for calling [addGroup] with `Group.ofDataExplorerTime(dataExplorerTime)`. */
        fun addGroup(dataExplorerTime: Group.DataExplorerTimeGroup) = apply {
            body.addGroup(dataExplorerTime)
        }

        fun limit(limit: Long) = apply { body.limit(limit) }

        /**
         * Sets [Builder.limit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.limit] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun limit(limit: JsonField<Long>) = apply { body.limit(limit) }

        fun meterIds(meterIds: List<String>) = apply { body.meterIds(meterIds) }

        /**
         * Sets [Builder.meterIds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.meterIds] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun meterIds(meterIds: JsonField<List<String>>) = apply { body.meterIds(meterIds) }

        /**
         * Adds a single [String] to [meterIds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addMeterId(meterId: String) = apply { body.addMeterId(meterId) }

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
         * Returns an immutable instance of [UsageQueryParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .orgId()
         * .endDate()
         * .startDate()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): UsageQueryParams =
            UsageQueryParams(
                checkRequired("orgId", orgId),
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    @NoAutoDetect
    class Aggregation
    @JsonCreator
    private constructor(
        @JsonProperty("fieldCode")
        @ExcludeMissing
        private val fieldCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("fieldType")
        @ExcludeMissing
        private val fieldType: JsonField<FieldType> = JsonMissing.of(),
        @JsonProperty("function")
        @ExcludeMissing
        private val function: JsonField<Function> = JsonMissing.of(),
        @JsonProperty("meterId")
        @ExcludeMissing
        private val meterId: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * Field code
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun fieldCode(): String = fieldCode.getRequired("fieldCode")

        /**
         * Type of field
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun fieldType(): FieldType = fieldType.getRequired("fieldType")

        /**
         * Aggregation function
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun function(): Function = function.getRequired("function")

        /**
         * Meter ID
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun meterId(): String = meterId.getRequired("meterId")

        /**
         * Returns the raw JSON value of [fieldCode].
         *
         * Unlike [fieldCode], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("fieldCode") @ExcludeMissing fun _fieldCode(): JsonField<String> = fieldCode

        /**
         * Returns the raw JSON value of [fieldType].
         *
         * Unlike [fieldType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("fieldType")
        @ExcludeMissing
        fun _fieldType(): JsonField<FieldType> = fieldType

        /**
         * Returns the raw JSON value of [function].
         *
         * Unlike [function], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("function") @ExcludeMissing fun _function(): JsonField<Function> = function

        /**
         * Returns the raw JSON value of [meterId].
         *
         * Unlike [meterId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("meterId") @ExcludeMissing fun _meterId(): JsonField<String> = meterId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Aggregation = apply {
            if (validated) {
                return@apply
            }

            fieldCode()
            fieldType()
            function()
            meterId()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [Aggregation].
             *
             * The following fields are required:
             * ```java
             * .fieldCode()
             * .fieldType()
             * .function()
             * .meterId()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Aggregation]. */
        class Builder internal constructor() {

            private var fieldCode: JsonField<String>? = null
            private var fieldType: JsonField<FieldType>? = null
            private var function: JsonField<Function>? = null
            private var meterId: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(aggregation: Aggregation) = apply {
                fieldCode = aggregation.fieldCode
                fieldType = aggregation.fieldType
                function = aggregation.function
                meterId = aggregation.meterId
                additionalProperties = aggregation.additionalProperties.toMutableMap()
            }

            /** Field code */
            fun fieldCode(fieldCode: String) = fieldCode(JsonField.of(fieldCode))

            /**
             * Sets [Builder.fieldCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.fieldCode] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun fieldCode(fieldCode: JsonField<String>) = apply { this.fieldCode = fieldCode }

            /** Type of field */
            fun fieldType(fieldType: FieldType) = fieldType(JsonField.of(fieldType))

            /**
             * Sets [Builder.fieldType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.fieldType] with a well-typed [FieldType] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun fieldType(fieldType: JsonField<FieldType>) = apply { this.fieldType = fieldType }

            /** Aggregation function */
            fun function(function: Function) = function(JsonField.of(function))

            /**
             * Sets [Builder.function] to an arbitrary JSON value.
             *
             * You should usually call [Builder.function] with a well-typed [Function] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun function(function: JsonField<Function>) = apply { this.function = function }

            /** Meter ID */
            fun meterId(meterId: String) = meterId(JsonField.of(meterId))

            /**
             * Sets [Builder.meterId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.meterId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun meterId(meterId: JsonField<String>) = apply { this.meterId = meterId }

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
             * Returns an immutable instance of [Aggregation].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .fieldCode()
             * .fieldType()
             * .function()
             * .meterId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Aggregation =
                Aggregation(
                    checkRequired("fieldCode", fieldCode),
                    checkRequired("fieldType", fieldType),
                    checkRequired("function", function),
                    checkRequired("meterId", meterId),
                    additionalProperties.toImmutable(),
                )
        }

        /** Type of field */
        class FieldType @JsonCreator private constructor(private val value: JsonField<String>) :
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

                @JvmField val DIMENSION = of("DIMENSION")

                @JvmField val MEASURE = of("MEASURE")

                @JvmStatic fun of(value: String) = FieldType(JsonField.of(value))
            }

            /** An enum containing [FieldType]'s known values. */
            enum class Known {
                DIMENSION,
                MEASURE,
            }

            /**
             * An enum containing [FieldType]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [FieldType] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                DIMENSION,
                MEASURE,
                /**
                 * An enum member indicating that [FieldType] was instantiated with an unknown
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
                    DIMENSION -> Value.DIMENSION
                    MEASURE -> Value.MEASURE
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
                    DIMENSION -> Known.DIMENSION
                    MEASURE -> Known.MEASURE
                    else -> throw M3terInvalidDataException("Unknown FieldType: $value")
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

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is FieldType && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** Aggregation function */
        class Function @JsonCreator private constructor(private val value: JsonField<String>) :
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

                @JvmField val SUM = of("SUM")

                @JvmField val MIN = of("MIN")

                @JvmField val MAX = of("MAX")

                @JvmField val COUNT = of("COUNT")

                @JvmField val LATEST = of("LATEST")

                @JvmField val MEAN = of("MEAN")

                @JvmField val UNIQUE = of("UNIQUE")

                @JvmStatic fun of(value: String) = Function(JsonField.of(value))
            }

            /** An enum containing [Function]'s known values. */
            enum class Known {
                SUM,
                MIN,
                MAX,
                COUNT,
                LATEST,
                MEAN,
                UNIQUE,
            }

            /**
             * An enum containing [Function]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Function] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                SUM,
                MIN,
                MAX,
                COUNT,
                LATEST,
                MEAN,
                UNIQUE,
                /**
                 * An enum member indicating that [Function] was instantiated with an unknown value.
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
                    SUM -> Value.SUM
                    MIN -> Value.MIN
                    MAX -> Value.MAX
                    COUNT -> Value.COUNT
                    LATEST -> Value.LATEST
                    MEAN -> Value.MEAN
                    UNIQUE -> Value.UNIQUE
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
                    SUM -> Known.SUM
                    MIN -> Known.MIN
                    MAX -> Known.MAX
                    COUNT -> Known.COUNT
                    LATEST -> Known.LATEST
                    MEAN -> Known.MEAN
                    UNIQUE -> Known.UNIQUE
                    else -> throw M3terInvalidDataException("Unknown Function: $value")
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

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Function && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Aggregation && fieldCode == other.fieldCode && fieldType == other.fieldType && function == other.function && meterId == other.meterId && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(fieldCode, fieldType, function, meterId, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Aggregation{fieldCode=$fieldCode, fieldType=$fieldType, function=$function, meterId=$meterId, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class DimensionFilter
    @JsonCreator
    private constructor(
        @JsonProperty("fieldCode")
        @ExcludeMissing
        private val fieldCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("meterId")
        @ExcludeMissing
        private val meterId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("values")
        @ExcludeMissing
        private val values: JsonField<List<String>> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * Field code
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun fieldCode(): String = fieldCode.getRequired("fieldCode")

        /**
         * Meter ID
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun meterId(): String = meterId.getRequired("meterId")

        /**
         * Values to filter by
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun values(): List<String> = values.getRequired("values")

        /**
         * Returns the raw JSON value of [fieldCode].
         *
         * Unlike [fieldCode], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("fieldCode") @ExcludeMissing fun _fieldCode(): JsonField<String> = fieldCode

        /**
         * Returns the raw JSON value of [meterId].
         *
         * Unlike [meterId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("meterId") @ExcludeMissing fun _meterId(): JsonField<String> = meterId

        /**
         * Returns the raw JSON value of [values].
         *
         * Unlike [values], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("values") @ExcludeMissing fun _values(): JsonField<List<String>> = values

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): DimensionFilter = apply {
            if (validated) {
                return@apply
            }

            fieldCode()
            meterId()
            values()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [DimensionFilter].
             *
             * The following fields are required:
             * ```java
             * .fieldCode()
             * .meterId()
             * .values()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [DimensionFilter]. */
        class Builder internal constructor() {

            private var fieldCode: JsonField<String>? = null
            private var meterId: JsonField<String>? = null
            private var values: JsonField<MutableList<String>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(dimensionFilter: DimensionFilter) = apply {
                fieldCode = dimensionFilter.fieldCode
                meterId = dimensionFilter.meterId
                values = dimensionFilter.values.map { it.toMutableList() }
                additionalProperties = dimensionFilter.additionalProperties.toMutableMap()
            }

            /** Field code */
            fun fieldCode(fieldCode: String) = fieldCode(JsonField.of(fieldCode))

            /**
             * Sets [Builder.fieldCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.fieldCode] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun fieldCode(fieldCode: JsonField<String>) = apply { this.fieldCode = fieldCode }

            /** Meter ID */
            fun meterId(meterId: String) = meterId(JsonField.of(meterId))

            /**
             * Sets [Builder.meterId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.meterId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun meterId(meterId: JsonField<String>) = apply { this.meterId = meterId }

            /** Values to filter by */
            fun values(values: List<String>) = values(JsonField.of(values))

            /**
             * Sets [Builder.values] to an arbitrary JSON value.
             *
             * You should usually call [Builder.values] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun values(values: JsonField<List<String>>) = apply {
                this.values = values.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [values].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addValue(value: String) = apply {
                values =
                    (values ?: JsonField.of(mutableListOf())).also {
                        checkKnown("values", it).add(value)
                    }
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
             * Returns an immutable instance of [DimensionFilter].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .fieldCode()
             * .meterId()
             * .values()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): DimensionFilter =
                DimensionFilter(
                    checkRequired("fieldCode", fieldCode),
                    checkRequired("meterId", meterId),
                    checkRequired("values", values).map { it.toImmutable() },
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is DimensionFilter && fieldCode == other.fieldCode && meterId == other.meterId && values == other.values && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(fieldCode, meterId, values, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "DimensionFilter{fieldCode=$fieldCode, meterId=$meterId, values=$values, additionalProperties=$additionalProperties}"
    }

    /** Group by a field */
    @JsonDeserialize(using = Group.Deserializer::class)
    @JsonSerialize(using = Group.Serializer::class)
    class Group
    private constructor(
        private val dataExplorerAccount: DataExplorerAccountGroup? = null,
        private val dataExplorerDimension: DataExplorerDimensionGroup? = null,
        private val dataExplorerTime: DataExplorerTimeGroup? = null,
        private val _json: JsonValue? = null,
    ) {

        /** Group by account */
        fun dataExplorerAccount(): Optional<DataExplorerAccountGroup> =
            Optional.ofNullable(dataExplorerAccount)

        /** Group by dimension */
        fun dataExplorerDimension(): Optional<DataExplorerDimensionGroup> =
            Optional.ofNullable(dataExplorerDimension)

        /** Group by time */
        fun dataExplorerTime(): Optional<DataExplorerTimeGroup> =
            Optional.ofNullable(dataExplorerTime)

        fun isDataExplorerAccount(): Boolean = dataExplorerAccount != null

        fun isDataExplorerDimension(): Boolean = dataExplorerDimension != null

        fun isDataExplorerTime(): Boolean = dataExplorerTime != null

        /** Group by account */
        fun asDataExplorerAccount(): DataExplorerAccountGroup =
            dataExplorerAccount.getOrThrow("dataExplorerAccount")

        /** Group by dimension */
        fun asDataExplorerDimension(): DataExplorerDimensionGroup =
            dataExplorerDimension.getOrThrow("dataExplorerDimension")

        /** Group by time */
        fun asDataExplorerTime(): DataExplorerTimeGroup =
            dataExplorerTime.getOrThrow("dataExplorerTime")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T {
            return when {
                dataExplorerAccount != null -> visitor.visitDataExplorerAccount(dataExplorerAccount)
                dataExplorerDimension != null ->
                    visitor.visitDataExplorerDimension(dataExplorerDimension)
                dataExplorerTime != null -> visitor.visitDataExplorerTime(dataExplorerTime)
                else -> visitor.unknown(_json)
            }
        }

        private var validated: Boolean = false

        fun validate(): Group = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitDataExplorerAccount(
                        dataExplorerAccount: DataExplorerAccountGroup
                    ) {
                        dataExplorerAccount.validate()
                    }

                    override fun visitDataExplorerDimension(
                        dataExplorerDimension: DataExplorerDimensionGroup
                    ) {
                        dataExplorerDimension.validate()
                    }

                    override fun visitDataExplorerTime(dataExplorerTime: DataExplorerTimeGroup) {
                        dataExplorerTime.validate()
                    }
                }
            )
            validated = true
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Group && dataExplorerAccount == other.dataExplorerAccount && dataExplorerDimension == other.dataExplorerDimension && dataExplorerTime == other.dataExplorerTime /* spotless:on */
        }

        override fun hashCode(): Int = /* spotless:off */ Objects.hash(dataExplorerAccount, dataExplorerDimension, dataExplorerTime) /* spotless:on */

        override fun toString(): String =
            when {
                dataExplorerAccount != null -> "Group{dataExplorerAccount=$dataExplorerAccount}"
                dataExplorerDimension != null ->
                    "Group{dataExplorerDimension=$dataExplorerDimension}"
                dataExplorerTime != null -> "Group{dataExplorerTime=$dataExplorerTime}"
                _json != null -> "Group{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Group")
            }

        companion object {

            /** Group by account */
            @JvmStatic
            fun ofDataExplorerAccount(dataExplorerAccount: DataExplorerAccountGroup) =
                Group(dataExplorerAccount = dataExplorerAccount)

            /** Group by dimension */
            @JvmStatic
            fun ofDataExplorerDimension(dataExplorerDimension: DataExplorerDimensionGroup) =
                Group(dataExplorerDimension = dataExplorerDimension)

            /** Group by time */
            @JvmStatic
            fun ofDataExplorerTime(dataExplorerTime: DataExplorerTimeGroup) =
                Group(dataExplorerTime = dataExplorerTime)
        }

        /** An interface that defines how to map each variant of [Group] to a value of type [T]. */
        interface Visitor<out T> {

            /** Group by account */
            fun visitDataExplorerAccount(dataExplorerAccount: DataExplorerAccountGroup): T

            /** Group by dimension */
            fun visitDataExplorerDimension(dataExplorerDimension: DataExplorerDimensionGroup): T

            /** Group by time */
            fun visitDataExplorerTime(dataExplorerTime: DataExplorerTimeGroup): T

            /**
             * Maps an unknown variant of [Group] to a value of type [T].
             *
             * An instance of [Group] can contain an unknown variant if it was deserialized from
             * data that doesn't match any known variant. For example, if the SDK is on an older
             * version than the API, then the API may respond with new variants that the SDK is
             * unaware of.
             *
             * @throws M3terInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw M3terInvalidDataException("Unknown Group: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<Group>(Group::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Group {
                val json = JsonValue.fromJsonNode(node)

                tryDeserialize(node, jacksonTypeRef<DataExplorerAccountGroup>()) { it.validate() }
                    ?.let {
                        return Group(dataExplorerAccount = it, _json = json)
                    }
                tryDeserialize(node, jacksonTypeRef<DataExplorerDimensionGroup>()) { it.validate() }
                    ?.let {
                        return Group(dataExplorerDimension = it, _json = json)
                    }
                tryDeserialize(node, jacksonTypeRef<DataExplorerTimeGroup>()) { it.validate() }
                    ?.let {
                        return Group(dataExplorerTime = it, _json = json)
                    }

                return Group(_json = json)
            }
        }

        internal class Serializer : BaseSerializer<Group>(Group::class) {

            override fun serialize(
                value: Group,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.dataExplorerAccount != null ->
                        generator.writeObject(value.dataExplorerAccount)
                    value.dataExplorerDimension != null ->
                        generator.writeObject(value.dataExplorerDimension)
                    value.dataExplorerTime != null -> generator.writeObject(value.dataExplorerTime)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Group")
                }
            }
        }

        /** Group by account */
        @NoAutoDetect
        class DataExplorerAccountGroup
        @JsonCreator
        private constructor(
            @JsonProperty("groupType")
            @ExcludeMissing
            private val groupType: JsonField<GroupType> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /**
             * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun groupType(): Optional<GroupType> =
                Optional.ofNullable(groupType.getNullable("groupType"))

            /**
             * Returns the raw JSON value of [groupType].
             *
             * Unlike [groupType], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("groupType")
            @ExcludeMissing
            fun _groupType(): JsonField<GroupType> = groupType

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): DataExplorerAccountGroup = apply {
                if (validated) {
                    return@apply
                }

                groupType()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of
                 * [DataExplorerAccountGroup].
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [DataExplorerAccountGroup]. */
            class Builder internal constructor() {

                private var groupType: JsonField<GroupType> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(dataExplorerAccountGroup: DataExplorerAccountGroup) = apply {
                    groupType = dataExplorerAccountGroup.groupType
                    additionalProperties =
                        dataExplorerAccountGroup.additionalProperties.toMutableMap()
                }

                fun groupType(groupType: GroupType) = groupType(JsonField.of(groupType))

                /**
                 * Sets [Builder.groupType] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.groupType] with a well-typed [GroupType] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun groupType(groupType: JsonField<GroupType>) = apply {
                    this.groupType = groupType
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [DataExplorerAccountGroup].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): DataExplorerAccountGroup =
                    DataExplorerAccountGroup(groupType, additionalProperties.toImmutable())
            }

            class GroupType @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val ACCOUNT = of("ACCOUNT")

                    @JvmField val DIMENSION = of("DIMENSION")

                    @JvmField val TIME = of("TIME")

                    @JvmStatic fun of(value: String) = GroupType(JsonField.of(value))
                }

                /** An enum containing [GroupType]'s known values. */
                enum class Known {
                    ACCOUNT,
                    DIMENSION,
                    TIME,
                }

                /**
                 * An enum containing [GroupType]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [GroupType] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    ACCOUNT,
                    DIMENSION,
                    TIME,
                    /**
                     * An enum member indicating that [GroupType] was instantiated with an unknown
                     * value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        ACCOUNT -> Value.ACCOUNT
                        DIMENSION -> Value.DIMENSION
                        TIME -> Value.TIME
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
                        ACCOUNT -> Known.ACCOUNT
                        DIMENSION -> Known.DIMENSION
                        TIME -> Known.TIME
                        else -> throw M3terInvalidDataException("Unknown GroupType: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws M3terInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        M3terInvalidDataException("Value is not a String")
                    }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is GroupType && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is DataExplorerAccountGroup && groupType == other.groupType && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(groupType, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "DataExplorerAccountGroup{groupType=$groupType, additionalProperties=$additionalProperties}"
        }

        /** Group by dimension */
        @NoAutoDetect
        class DataExplorerDimensionGroup
        @JsonCreator
        private constructor(
            @JsonProperty("fieldCode")
            @ExcludeMissing
            private val fieldCode: JsonField<String> = JsonMissing.of(),
            @JsonProperty("meterId")
            @ExcludeMissing
            private val meterId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("groupType")
            @ExcludeMissing
            private val groupType: JsonField<GroupType> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /**
             * Field code to group by
             *
             * @throws M3terInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun fieldCode(): String = fieldCode.getRequired("fieldCode")

            /**
             * Meter ID to group by
             *
             * @throws M3terInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun meterId(): String = meterId.getRequired("meterId")

            /**
             * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun groupType(): Optional<GroupType> =
                Optional.ofNullable(groupType.getNullable("groupType"))

            /**
             * Returns the raw JSON value of [fieldCode].
             *
             * Unlike [fieldCode], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("fieldCode")
            @ExcludeMissing
            fun _fieldCode(): JsonField<String> = fieldCode

            /**
             * Returns the raw JSON value of [meterId].
             *
             * Unlike [meterId], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("meterId") @ExcludeMissing fun _meterId(): JsonField<String> = meterId

            /**
             * Returns the raw JSON value of [groupType].
             *
             * Unlike [groupType], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("groupType")
            @ExcludeMissing
            fun _groupType(): JsonField<GroupType> = groupType

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): DataExplorerDimensionGroup = apply {
                if (validated) {
                    return@apply
                }

                fieldCode()
                meterId()
                groupType()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of
                 * [DataExplorerDimensionGroup].
                 *
                 * The following fields are required:
                 * ```java
                 * .fieldCode()
                 * .meterId()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [DataExplorerDimensionGroup]. */
            class Builder internal constructor() {

                private var fieldCode: JsonField<String>? = null
                private var meterId: JsonField<String>? = null
                private var groupType: JsonField<GroupType> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(dataExplorerDimensionGroup: DataExplorerDimensionGroup) = apply {
                    fieldCode = dataExplorerDimensionGroup.fieldCode
                    meterId = dataExplorerDimensionGroup.meterId
                    groupType = dataExplorerDimensionGroup.groupType
                    additionalProperties =
                        dataExplorerDimensionGroup.additionalProperties.toMutableMap()
                }

                /** Field code to group by */
                fun fieldCode(fieldCode: String) = fieldCode(JsonField.of(fieldCode))

                /**
                 * Sets [Builder.fieldCode] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.fieldCode] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun fieldCode(fieldCode: JsonField<String>) = apply { this.fieldCode = fieldCode }

                /** Meter ID to group by */
                fun meterId(meterId: String) = meterId(JsonField.of(meterId))

                /**
                 * Sets [Builder.meterId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.meterId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun meterId(meterId: JsonField<String>) = apply { this.meterId = meterId }

                fun groupType(groupType: GroupType) = groupType(JsonField.of(groupType))

                /**
                 * Sets [Builder.groupType] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.groupType] with a well-typed [GroupType] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun groupType(groupType: JsonField<GroupType>) = apply {
                    this.groupType = groupType
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [DataExplorerDimensionGroup].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .fieldCode()
                 * .meterId()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): DataExplorerDimensionGroup =
                    DataExplorerDimensionGroup(
                        checkRequired("fieldCode", fieldCode),
                        checkRequired("meterId", meterId),
                        groupType,
                        additionalProperties.toImmutable(),
                    )
            }

            class GroupType @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val ACCOUNT = of("ACCOUNT")

                    @JvmField val DIMENSION = of("DIMENSION")

                    @JvmField val TIME = of("TIME")

                    @JvmStatic fun of(value: String) = GroupType(JsonField.of(value))
                }

                /** An enum containing [GroupType]'s known values. */
                enum class Known {
                    ACCOUNT,
                    DIMENSION,
                    TIME,
                }

                /**
                 * An enum containing [GroupType]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [GroupType] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    ACCOUNT,
                    DIMENSION,
                    TIME,
                    /**
                     * An enum member indicating that [GroupType] was instantiated with an unknown
                     * value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        ACCOUNT -> Value.ACCOUNT
                        DIMENSION -> Value.DIMENSION
                        TIME -> Value.TIME
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
                        ACCOUNT -> Known.ACCOUNT
                        DIMENSION -> Known.DIMENSION
                        TIME -> Known.TIME
                        else -> throw M3terInvalidDataException("Unknown GroupType: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws M3terInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        M3terInvalidDataException("Value is not a String")
                    }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is GroupType && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is DataExplorerDimensionGroup && fieldCode == other.fieldCode && meterId == other.meterId && groupType == other.groupType && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(fieldCode, meterId, groupType, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "DataExplorerDimensionGroup{fieldCode=$fieldCode, meterId=$meterId, groupType=$groupType, additionalProperties=$additionalProperties}"
        }

        /** Group by time */
        @NoAutoDetect
        class DataExplorerTimeGroup
        @JsonCreator
        private constructor(
            @JsonProperty("frequency")
            @ExcludeMissing
            private val frequency: JsonField<Frequency> = JsonMissing.of(),
            @JsonProperty("groupType")
            @ExcludeMissing
            private val groupType: JsonField<GroupType> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /**
             * Frequency of usage data
             *
             * @throws M3terInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun frequency(): Frequency = frequency.getRequired("frequency")

            /**
             * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun groupType(): Optional<GroupType> =
                Optional.ofNullable(groupType.getNullable("groupType"))

            /**
             * Returns the raw JSON value of [frequency].
             *
             * Unlike [frequency], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("frequency")
            @ExcludeMissing
            fun _frequency(): JsonField<Frequency> = frequency

            /**
             * Returns the raw JSON value of [groupType].
             *
             * Unlike [groupType], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("groupType")
            @ExcludeMissing
            fun _groupType(): JsonField<GroupType> = groupType

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): DataExplorerTimeGroup = apply {
                if (validated) {
                    return@apply
                }

                frequency()
                groupType()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of
                 * [DataExplorerTimeGroup].
                 *
                 * The following fields are required:
                 * ```java
                 * .frequency()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [DataExplorerTimeGroup]. */
            class Builder internal constructor() {

                private var frequency: JsonField<Frequency>? = null
                private var groupType: JsonField<GroupType> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(dataExplorerTimeGroup: DataExplorerTimeGroup) = apply {
                    frequency = dataExplorerTimeGroup.frequency
                    groupType = dataExplorerTimeGroup.groupType
                    additionalProperties = dataExplorerTimeGroup.additionalProperties.toMutableMap()
                }

                /** Frequency of usage data */
                fun frequency(frequency: Frequency) = frequency(JsonField.of(frequency))

                /**
                 * Sets [Builder.frequency] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.frequency] with a well-typed [Frequency] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun frequency(frequency: JsonField<Frequency>) = apply {
                    this.frequency = frequency
                }

                fun groupType(groupType: GroupType) = groupType(JsonField.of(groupType))

                /**
                 * Sets [Builder.groupType] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.groupType] with a well-typed [GroupType] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun groupType(groupType: JsonField<GroupType>) = apply {
                    this.groupType = groupType
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [DataExplorerTimeGroup].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .frequency()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): DataExplorerTimeGroup =
                    DataExplorerTimeGroup(
                        checkRequired("frequency", frequency),
                        groupType,
                        additionalProperties.toImmutable(),
                    )
            }

            /** Frequency of usage data */
            class Frequency @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val DAY = of("DAY")

                    @JvmField val HOUR = of("HOUR")

                    @JvmField val WEEK = of("WEEK")

                    @JvmField val MONTH = of("MONTH")

                    @JvmField val QUARTER = of("QUARTER")

                    @JvmStatic fun of(value: String) = Frequency(JsonField.of(value))
                }

                /** An enum containing [Frequency]'s known values. */
                enum class Known {
                    DAY,
                    HOUR,
                    WEEK,
                    MONTH,
                    QUARTER,
                }

                /**
                 * An enum containing [Frequency]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Frequency] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    DAY,
                    HOUR,
                    WEEK,
                    MONTH,
                    QUARTER,
                    /**
                     * An enum member indicating that [Frequency] was instantiated with an unknown
                     * value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        DAY -> Value.DAY
                        HOUR -> Value.HOUR
                        WEEK -> Value.WEEK
                        MONTH -> Value.MONTH
                        QUARTER -> Value.QUARTER
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
                        DAY -> Known.DAY
                        HOUR -> Known.HOUR
                        WEEK -> Known.WEEK
                        MONTH -> Known.MONTH
                        QUARTER -> Known.QUARTER
                        else -> throw M3terInvalidDataException("Unknown Frequency: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws M3terInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        M3terInvalidDataException("Value is not a String")
                    }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Frequency && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            class GroupType @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val ACCOUNT = of("ACCOUNT")

                    @JvmField val DIMENSION = of("DIMENSION")

                    @JvmField val TIME = of("TIME")

                    @JvmStatic fun of(value: String) = GroupType(JsonField.of(value))
                }

                /** An enum containing [GroupType]'s known values. */
                enum class Known {
                    ACCOUNT,
                    DIMENSION,
                    TIME,
                }

                /**
                 * An enum containing [GroupType]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [GroupType] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    ACCOUNT,
                    DIMENSION,
                    TIME,
                    /**
                     * An enum member indicating that [GroupType] was instantiated with an unknown
                     * value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        ACCOUNT -> Value.ACCOUNT
                        DIMENSION -> Value.DIMENSION
                        TIME -> Value.TIME
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
                        ACCOUNT -> Known.ACCOUNT
                        DIMENSION -> Known.DIMENSION
                        TIME -> Known.TIME
                        else -> throw M3terInvalidDataException("Unknown GroupType: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws M3terInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        M3terInvalidDataException("Value is not a String")
                    }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is GroupType && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is DataExplorerTimeGroup && frequency == other.frequency && groupType == other.groupType && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(frequency, groupType, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "DataExplorerTimeGroup{frequency=$frequency, groupType=$groupType, additionalProperties=$additionalProperties}"
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is UsageQueryParams && orgId == other.orgId && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(orgId, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "UsageQueryParams{orgId=$orgId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
