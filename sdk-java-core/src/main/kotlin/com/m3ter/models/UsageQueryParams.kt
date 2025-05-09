// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

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
import com.m3ter.core.BaseDeserializer
import com.m3ter.core.BaseSerializer
import com.m3ter.core.Enum
import com.m3ter.core.ExcludeMissing
import com.m3ter.core.JsonField
import com.m3ter.core.JsonMissing
import com.m3ter.core.JsonValue
import com.m3ter.core.Params
import com.m3ter.core.allMaxBy
import com.m3ter.core.checkKnown
import com.m3ter.core.checkRequired
import com.m3ter.core.getOrThrow
import com.m3ter.core.http.Headers
import com.m3ter.core.http.QueryParams
import com.m3ter.core.toImmutable
import com.m3ter.errors.M3terInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Query and filter usage data collected for your Organization.
 *
 * You can use several parameters to filter the range of usage data returned:
 * - **Time period.** Use `startDate` and `endDate` to define a period. The query references the
 *   `timestamp` values of usage data submissions for applying the defined time period, and not the
 *   time submissions were `receivedAt` by the platform. Only usage data with a `timestamp` that
 *   falls in the defined time period are returned.(Required)
 * - **Meters.** Specify the Meters you want the query to return data for.
 * - **Accounts.** Specify the Accounts you want the query to return data for.
 * - **Dimension Filters.** Specify values for Dimension data fields on included Meters. Only data
 *   that match the specified Dimension field values will be returned for the query.
 *
 * You can apply Aggregations functions to the usage data returned for the query. If you apply
 * Aggregations, you can select to group the data by:
 * - **Account**
 * - **Time**
 * - **Dimension**
 */
class UsageQueryParams
private constructor(
    private val orgId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    @Deprecated("the org id should be set at the client level instead")
    fun orgId(): Optional<String> = Optional.ofNullable(orgId)

    /**
     * Specify the Accounts you want the query to return usage data for.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun accountIds(): Optional<List<String>> = body.accountIds()

    /**
     * Define the Aggregation functions you want to apply to data fields on included Meters:
     * - **SUM**. Adds the values.
     * - **MIN**. Uses the minimum value.
     * - **MAX**. Uses the maximum value.
     * - **COUNT**. Counts the number of values.
     * - **LATEST**. Uses the most recent value.
     * - **MEAN**. Uses the arithmetic mean of the values.
     * - **UNIQUE**. Uses a count of the number of unique values.
     *
     * **NOTE!** The Aggregation functions that can be applied depend on the data field type:
     * - **Measure** fields. `SUM`, `MIN`, `MAX`, `COUNT`, `LATEST`, or `MEAN` functions can be
     *   applied.
     * - **Dimension** field. `COUNT` or `UNIQUE` functions can be applied.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun aggregations(): Optional<List<Aggregation>> = body.aggregations()

    /**
     * Define Dimension filters you want to apply for the query.
     *
     * Specify values for Dimension data fields on included Meters. Only data that match the
     * specified Dimension field values will be returned for the query.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dimensionFilters(): Optional<List<DimensionFilter>> = body.dimensionFilters()

    /**
     * The exclusive end date to define a time period to filter by. (_ISO 8601 formatted_)
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun endDate(): Optional<OffsetDateTime> = body.endDate()

    /**
     * If you've applied Aggregations for your query, specify any grouping you want to impose on the
     * returned data:
     * - **Account**
     * - **Time** - group by frequency. Five options: `DAY`, `HOUR`, `WEEK`, `MONTH`, or `QUARTER`.
     * - **Dimension** - group by Meter and data field.
     *
     * **NOTE:** If you attempt to impose grouping for a query that doesn't apply Aggregations,
     * you'll receive an error.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun groups(): Optional<List<Group>> = body.groups()

    /**
     * Define a limit for the number of usage data items you want the query to return, starting with
     * the most recently received data item.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun limit(): Optional<Int> = body.limit()

    /**
     * Specify the Meters you want the query to return usage data for.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun meterIds(): Optional<List<String>> = body.meterIds()

    /**
     * The inclusive start date to define a time period to filter by. (_ISO 8601 formatted_)
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun startDate(): Optional<OffsetDateTime> = body.startDate()

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
     * Returns the raw JSON value of [endDate].
     *
     * Unlike [endDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _endDate(): JsonField<OffsetDateTime> = body._endDate()

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
    fun _limit(): JsonField<Int> = body._limit()

    /**
     * Returns the raw JSON value of [meterIds].
     *
     * Unlike [meterIds], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _meterIds(): JsonField<List<String>> = body._meterIds()

    /**
     * Returns the raw JSON value of [startDate].
     *
     * Unlike [startDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _startDate(): JsonField<OffsetDateTime> = body._startDate()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): UsageQueryParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [UsageQueryParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [UsageQueryParams]. */
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
         * - [accountIds]
         * - [aggregations]
         * - [dimensionFilters]
         * - [endDate]
         * - [groups]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** Specify the Accounts you want the query to return usage data for. */
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

        /**
         * Define the Aggregation functions you want to apply to data fields on included Meters:
         * - **SUM**. Adds the values.
         * - **MIN**. Uses the minimum value.
         * - **MAX**. Uses the maximum value.
         * - **COUNT**. Counts the number of values.
         * - **LATEST**. Uses the most recent value.
         * - **MEAN**. Uses the arithmetic mean of the values.
         * - **UNIQUE**. Uses a count of the number of unique values.
         *
         * **NOTE!** The Aggregation functions that can be applied depend on the data field type:
         * - **Measure** fields. `SUM`, `MIN`, `MAX`, `COUNT`, `LATEST`, or `MEAN` functions can be
         *   applied.
         * - **Dimension** field. `COUNT` or `UNIQUE` functions can be applied.
         */
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

        /**
         * Define Dimension filters you want to apply for the query.
         *
         * Specify values for Dimension data fields on included Meters. Only data that match the
         * specified Dimension field values will be returned for the query.
         */
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

        /** The exclusive end date to define a time period to filter by. (_ISO 8601 formatted_) */
        fun endDate(endDate: OffsetDateTime) = apply { body.endDate(endDate) }

        /**
         * Sets [Builder.endDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.endDate] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun endDate(endDate: JsonField<OffsetDateTime>) = apply { body.endDate(endDate) }

        /**
         * If you've applied Aggregations for your query, specify any grouping you want to impose on
         * the returned data:
         * - **Account**
         * - **Time** - group by frequency. Five options: `DAY`, `HOUR`, `WEEK`, `MONTH`, or
         *   `QUARTER`.
         * - **Dimension** - group by Meter and data field.
         *
         * **NOTE:** If you attempt to impose grouping for a query that doesn't apply Aggregations,
         * you'll receive an error.
         */
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

        /**
         * Alias for calling [addGroup] with
         * `Group.ofDataExportsDataExplorerAccount(dataExportsDataExplorerAccount)`.
         */
        fun addGroup(dataExportsDataExplorerAccount: Group.DataExportsDataExplorerAccountGroup) =
            apply {
                body.addGroup(dataExportsDataExplorerAccount)
            }

        /**
         * Alias for calling [addGroup] with
         * `Group.ofDataExportsDataExplorerDimension(dataExportsDataExplorerDimension)`.
         */
        fun addGroup(
            dataExportsDataExplorerDimension: Group.DataExportsDataExplorerDimensionGroup
        ) = apply { body.addGroup(dataExportsDataExplorerDimension) }

        /**
         * Alias for calling [addGroup] with
         * `Group.ofDataExportsDataExplorerTime(dataExportsDataExplorerTime)`.
         */
        fun addGroup(dataExportsDataExplorerTime: Group.DataExportsDataExplorerTimeGroup) = apply {
            body.addGroup(dataExportsDataExplorerTime)
        }

        /**
         * Define a limit for the number of usage data items you want the query to return, starting
         * with the most recently received data item.
         */
        fun limit(limit: Int) = apply { body.limit(limit) }

        /**
         * Sets [Builder.limit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.limit] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun limit(limit: JsonField<Int>) = apply { body.limit(limit) }

        /** Specify the Meters you want the query to return usage data for. */
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

        /** The inclusive start date to define a time period to filter by. (_ISO 8601 formatted_) */
        fun startDate(startDate: OffsetDateTime) = apply { body.startDate(startDate) }

        /**
         * Sets [Builder.startDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.startDate] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun startDate(startDate: JsonField<OffsetDateTime>) = apply { body.startDate(startDate) }

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
         */
        fun build(): UsageQueryParams =
            UsageQueryParams(
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

    class Body
    private constructor(
        private val accountIds: JsonField<List<String>>,
        private val aggregations: JsonField<List<Aggregation>>,
        private val dimensionFilters: JsonField<List<DimensionFilter>>,
        private val endDate: JsonField<OffsetDateTime>,
        private val groups: JsonField<List<Group>>,
        private val limit: JsonField<Int>,
        private val meterIds: JsonField<List<String>>,
        private val startDate: JsonField<OffsetDateTime>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("accountIds")
            @ExcludeMissing
            accountIds: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("aggregations")
            @ExcludeMissing
            aggregations: JsonField<List<Aggregation>> = JsonMissing.of(),
            @JsonProperty("dimensionFilters")
            @ExcludeMissing
            dimensionFilters: JsonField<List<DimensionFilter>> = JsonMissing.of(),
            @JsonProperty("endDate")
            @ExcludeMissing
            endDate: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("groups")
            @ExcludeMissing
            groups: JsonField<List<Group>> = JsonMissing.of(),
            @JsonProperty("limit") @ExcludeMissing limit: JsonField<Int> = JsonMissing.of(),
            @JsonProperty("meterIds")
            @ExcludeMissing
            meterIds: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("startDate")
            @ExcludeMissing
            startDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        ) : this(
            accountIds,
            aggregations,
            dimensionFilters,
            endDate,
            groups,
            limit,
            meterIds,
            startDate,
            mutableMapOf(),
        )

        /**
         * Specify the Accounts you want the query to return usage data for.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun accountIds(): Optional<List<String>> = accountIds.getOptional("accountIds")

        /**
         * Define the Aggregation functions you want to apply to data fields on included Meters:
         * - **SUM**. Adds the values.
         * - **MIN**. Uses the minimum value.
         * - **MAX**. Uses the maximum value.
         * - **COUNT**. Counts the number of values.
         * - **LATEST**. Uses the most recent value.
         * - **MEAN**. Uses the arithmetic mean of the values.
         * - **UNIQUE**. Uses a count of the number of unique values.
         *
         * **NOTE!** The Aggregation functions that can be applied depend on the data field type:
         * - **Measure** fields. `SUM`, `MIN`, `MAX`, `COUNT`, `LATEST`, or `MEAN` functions can be
         *   applied.
         * - **Dimension** field. `COUNT` or `UNIQUE` functions can be applied.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun aggregations(): Optional<List<Aggregation>> = aggregations.getOptional("aggregations")

        /**
         * Define Dimension filters you want to apply for the query.
         *
         * Specify values for Dimension data fields on included Meters. Only data that match the
         * specified Dimension field values will be returned for the query.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun dimensionFilters(): Optional<List<DimensionFilter>> =
            dimensionFilters.getOptional("dimensionFilters")

        /**
         * The exclusive end date to define a time period to filter by. (_ISO 8601 formatted_)
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun endDate(): Optional<OffsetDateTime> = endDate.getOptional("endDate")

        /**
         * If you've applied Aggregations for your query, specify any grouping you want to impose on
         * the returned data:
         * - **Account**
         * - **Time** - group by frequency. Five options: `DAY`, `HOUR`, `WEEK`, `MONTH`, or
         *   `QUARTER`.
         * - **Dimension** - group by Meter and data field.
         *
         * **NOTE:** If you attempt to impose grouping for a query that doesn't apply Aggregations,
         * you'll receive an error.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun groups(): Optional<List<Group>> = groups.getOptional("groups")

        /**
         * Define a limit for the number of usage data items you want the query to return, starting
         * with the most recently received data item.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun limit(): Optional<Int> = limit.getOptional("limit")

        /**
         * Specify the Meters you want the query to return usage data for.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun meterIds(): Optional<List<String>> = meterIds.getOptional("meterIds")

        /**
         * The inclusive start date to define a time period to filter by. (_ISO 8601 formatted_)
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun startDate(): Optional<OffsetDateTime> = startDate.getOptional("startDate")

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
         * Returns the raw JSON value of [endDate].
         *
         * Unlike [endDate], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("endDate") @ExcludeMissing fun _endDate(): JsonField<OffsetDateTime> = endDate

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
        @JsonProperty("limit") @ExcludeMissing fun _limit(): JsonField<Int> = limit

        /**
         * Returns the raw JSON value of [meterIds].
         *
         * Unlike [meterIds], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("meterIds")
        @ExcludeMissing
        fun _meterIds(): JsonField<List<String>> = meterIds

        /**
         * Returns the raw JSON value of [startDate].
         *
         * Unlike [startDate], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("startDate")
        @ExcludeMissing
        fun _startDate(): JsonField<OffsetDateTime> = startDate

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

            /** Returns a mutable builder for constructing an instance of [Body]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var accountIds: JsonField<MutableList<String>>? = null
            private var aggregations: JsonField<MutableList<Aggregation>>? = null
            private var dimensionFilters: JsonField<MutableList<DimensionFilter>>? = null
            private var endDate: JsonField<OffsetDateTime> = JsonMissing.of()
            private var groups: JsonField<MutableList<Group>>? = null
            private var limit: JsonField<Int> = JsonMissing.of()
            private var meterIds: JsonField<MutableList<String>>? = null
            private var startDate: JsonField<OffsetDateTime> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                accountIds = body.accountIds.map { it.toMutableList() }
                aggregations = body.aggregations.map { it.toMutableList() }
                dimensionFilters = body.dimensionFilters.map { it.toMutableList() }
                endDate = body.endDate
                groups = body.groups.map { it.toMutableList() }
                limit = body.limit
                meterIds = body.meterIds.map { it.toMutableList() }
                startDate = body.startDate
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** Specify the Accounts you want the query to return usage data for. */
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

            /**
             * Define the Aggregation functions you want to apply to data fields on included Meters:
             * - **SUM**. Adds the values.
             * - **MIN**. Uses the minimum value.
             * - **MAX**. Uses the maximum value.
             * - **COUNT**. Counts the number of values.
             * - **LATEST**. Uses the most recent value.
             * - **MEAN**. Uses the arithmetic mean of the values.
             * - **UNIQUE**. Uses a count of the number of unique values.
             *
             * **NOTE!** The Aggregation functions that can be applied depend on the data field
             * type:
             * - **Measure** fields. `SUM`, `MIN`, `MAX`, `COUNT`, `LATEST`, or `MEAN` functions can
             *   be applied.
             * - **Dimension** field. `COUNT` or `UNIQUE` functions can be applied.
             */
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

            /**
             * Define Dimension filters you want to apply for the query.
             *
             * Specify values for Dimension data fields on included Meters. Only data that match the
             * specified Dimension field values will be returned for the query.
             */
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

            /**
             * The exclusive end date to define a time period to filter by. (_ISO 8601 formatted_)
             */
            fun endDate(endDate: OffsetDateTime) = endDate(JsonField.of(endDate))

            /**
             * Sets [Builder.endDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.endDate] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun endDate(endDate: JsonField<OffsetDateTime>) = apply { this.endDate = endDate }

            /**
             * If you've applied Aggregations for your query, specify any grouping you want to
             * impose on the returned data:
             * - **Account**
             * - **Time** - group by frequency. Five options: `DAY`, `HOUR`, `WEEK`, `MONTH`, or
             *   `QUARTER`.
             * - **Dimension** - group by Meter and data field.
             *
             * **NOTE:** If you attempt to impose grouping for a query that doesn't apply
             * Aggregations, you'll receive an error.
             */
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
             * Alias for calling [addGroup] with
             * `Group.ofDataExportsDataExplorerAccount(dataExportsDataExplorerAccount)`.
             */
            fun addGroup(
                dataExportsDataExplorerAccount: Group.DataExportsDataExplorerAccountGroup
            ) = addGroup(Group.ofDataExportsDataExplorerAccount(dataExportsDataExplorerAccount))

            /**
             * Alias for calling [addGroup] with
             * `Group.ofDataExportsDataExplorerDimension(dataExportsDataExplorerDimension)`.
             */
            fun addGroup(
                dataExportsDataExplorerDimension: Group.DataExportsDataExplorerDimensionGroup
            ) = addGroup(Group.ofDataExportsDataExplorerDimension(dataExportsDataExplorerDimension))

            /**
             * Alias for calling [addGroup] with
             * `Group.ofDataExportsDataExplorerTime(dataExportsDataExplorerTime)`.
             */
            fun addGroup(dataExportsDataExplorerTime: Group.DataExportsDataExplorerTimeGroup) =
                addGroup(Group.ofDataExportsDataExplorerTime(dataExportsDataExplorerTime))

            /**
             * Define a limit for the number of usage data items you want the query to return,
             * starting with the most recently received data item.
             */
            fun limit(limit: Int) = limit(JsonField.of(limit))

            /**
             * Sets [Builder.limit] to an arbitrary JSON value.
             *
             * You should usually call [Builder.limit] with a well-typed [Int] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun limit(limit: JsonField<Int>) = apply { this.limit = limit }

            /** Specify the Meters you want the query to return usage data for. */
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

            /**
             * The inclusive start date to define a time period to filter by. (_ISO 8601 formatted_)
             */
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
             */
            fun build(): Body =
                Body(
                    (accountIds ?: JsonMissing.of()).map { it.toImmutable() },
                    (aggregations ?: JsonMissing.of()).map { it.toImmutable() },
                    (dimensionFilters ?: JsonMissing.of()).map { it.toImmutable() },
                    endDate,
                    (groups ?: JsonMissing.of()).map { it.toImmutable() },
                    limit,
                    (meterIds ?: JsonMissing.of()).map { it.toImmutable() },
                    startDate,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            accountIds()
            aggregations().ifPresent { it.forEach { it.validate() } }
            dimensionFilters().ifPresent { it.forEach { it.validate() } }
            endDate()
            groups().ifPresent { it.forEach { it.validate() } }
            limit()
            meterIds()
            startDate()
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
            (accountIds.asKnown().getOrNull()?.size ?: 0) +
                (aggregations.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (dimensionFilters.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (endDate.asKnown().isPresent) 1 else 0) +
                (groups.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (limit.asKnown().isPresent) 1 else 0) +
                (meterIds.asKnown().getOrNull()?.size ?: 0) +
                (if (startDate.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Body && accountIds == other.accountIds && aggregations == other.aggregations && dimensionFilters == other.dimensionFilters && endDate == other.endDate && groups == other.groups && limit == other.limit && meterIds == other.meterIds && startDate == other.startDate && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(accountIds, aggregations, dimensionFilters, endDate, groups, limit, meterIds, startDate, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{accountIds=$accountIds, aggregations=$aggregations, dimensionFilters=$dimensionFilters, endDate=$endDate, groups=$groups, limit=$limit, meterIds=$meterIds, startDate=$startDate, additionalProperties=$additionalProperties}"
    }

    class Aggregation
    private constructor(
        private val fieldCode: JsonField<String>,
        private val fieldType: JsonField<FieldType>,
        private val function: JsonField<Function>,
        private val meterId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("fieldCode")
            @ExcludeMissing
            fieldCode: JsonField<String> = JsonMissing.of(),
            @JsonProperty("fieldType")
            @ExcludeMissing
            fieldType: JsonField<FieldType> = JsonMissing.of(),
            @JsonProperty("function")
            @ExcludeMissing
            function: JsonField<Function> = JsonMissing.of(),
            @JsonProperty("meterId") @ExcludeMissing meterId: JsonField<String> = JsonMissing.of(),
        ) : this(fieldCode, fieldType, function, meterId, mutableMapOf())

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
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Aggregation = apply {
            if (validated) {
                return@apply
            }

            fieldCode()
            fieldType().validate()
            function().validate()
            meterId()
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
            (if (fieldCode.asKnown().isPresent) 1 else 0) +
                (fieldType.asKnown().getOrNull()?.validity() ?: 0) +
                (function.asKnown().getOrNull()?.validity() ?: 0) +
                (if (meterId.asKnown().isPresent) 1 else 0)

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

            private var validated: Boolean = false

            fun validate(): FieldType = apply {
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

            private var validated: Boolean = false

            fun validate(): Function = apply {
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

    class DimensionFilter
    private constructor(
        private val fieldCode: JsonField<String>,
        private val meterId: JsonField<String>,
        private val values: JsonField<List<String>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("fieldCode")
            @ExcludeMissing
            fieldCode: JsonField<String> = JsonMissing.of(),
            @JsonProperty("meterId") @ExcludeMissing meterId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("values")
            @ExcludeMissing
            values: JsonField<List<String>> = JsonMissing.of(),
        ) : this(fieldCode, meterId, values, mutableMapOf())

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
                    additionalProperties.toMutableMap(),
                )
        }

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
            (if (fieldCode.asKnown().isPresent) 1 else 0) +
                (if (meterId.asKnown().isPresent) 1 else 0) +
                (values.asKnown().getOrNull()?.size ?: 0)

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
        private val dataExportsDataExplorerAccount: DataExportsDataExplorerAccountGroup? = null,
        private val dataExportsDataExplorerDimension: DataExportsDataExplorerDimensionGroup? = null,
        private val dataExportsDataExplorerTime: DataExportsDataExplorerTimeGroup? = null,
        private val _json: JsonValue? = null,
    ) {

        /** Group by account */
        fun dataExportsDataExplorerAccount(): Optional<DataExportsDataExplorerAccountGroup> =
            Optional.ofNullable(dataExportsDataExplorerAccount)

        /** Group by dimension */
        fun dataExportsDataExplorerDimension(): Optional<DataExportsDataExplorerDimensionGroup> =
            Optional.ofNullable(dataExportsDataExplorerDimension)

        /** Group by time */
        fun dataExportsDataExplorerTime(): Optional<DataExportsDataExplorerTimeGroup> =
            Optional.ofNullable(dataExportsDataExplorerTime)

        fun isDataExportsDataExplorerAccount(): Boolean = dataExportsDataExplorerAccount != null

        fun isDataExportsDataExplorerDimension(): Boolean = dataExportsDataExplorerDimension != null

        fun isDataExportsDataExplorerTime(): Boolean = dataExportsDataExplorerTime != null

        /** Group by account */
        fun asDataExportsDataExplorerAccount(): DataExportsDataExplorerAccountGroup =
            dataExportsDataExplorerAccount.getOrThrow("dataExportsDataExplorerAccount")

        /** Group by dimension */
        fun asDataExportsDataExplorerDimension(): DataExportsDataExplorerDimensionGroup =
            dataExportsDataExplorerDimension.getOrThrow("dataExportsDataExplorerDimension")

        /** Group by time */
        fun asDataExportsDataExplorerTime(): DataExportsDataExplorerTimeGroup =
            dataExportsDataExplorerTime.getOrThrow("dataExportsDataExplorerTime")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                dataExportsDataExplorerAccount != null ->
                    visitor.visitDataExportsDataExplorerAccount(dataExportsDataExplorerAccount)
                dataExportsDataExplorerDimension != null ->
                    visitor.visitDataExportsDataExplorerDimension(dataExportsDataExplorerDimension)
                dataExportsDataExplorerTime != null ->
                    visitor.visitDataExportsDataExplorerTime(dataExportsDataExplorerTime)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        fun validate(): Group = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitDataExportsDataExplorerAccount(
                        dataExportsDataExplorerAccount: DataExportsDataExplorerAccountGroup
                    ) {
                        dataExportsDataExplorerAccount.validate()
                    }

                    override fun visitDataExportsDataExplorerDimension(
                        dataExportsDataExplorerDimension: DataExportsDataExplorerDimensionGroup
                    ) {
                        dataExportsDataExplorerDimension.validate()
                    }

                    override fun visitDataExportsDataExplorerTime(
                        dataExportsDataExplorerTime: DataExportsDataExplorerTimeGroup
                    ) {
                        dataExportsDataExplorerTime.validate()
                    }
                }
            )
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
            accept(
                object : Visitor<Int> {
                    override fun visitDataExportsDataExplorerAccount(
                        dataExportsDataExplorerAccount: DataExportsDataExplorerAccountGroup
                    ) = dataExportsDataExplorerAccount.validity()

                    override fun visitDataExportsDataExplorerDimension(
                        dataExportsDataExplorerDimension: DataExportsDataExplorerDimensionGroup
                    ) = dataExportsDataExplorerDimension.validity()

                    override fun visitDataExportsDataExplorerTime(
                        dataExportsDataExplorerTime: DataExportsDataExplorerTimeGroup
                    ) = dataExportsDataExplorerTime.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Group && dataExportsDataExplorerAccount == other.dataExportsDataExplorerAccount && dataExportsDataExplorerDimension == other.dataExportsDataExplorerDimension && dataExportsDataExplorerTime == other.dataExportsDataExplorerTime /* spotless:on */
        }

        override fun hashCode(): Int = /* spotless:off */ Objects.hash(dataExportsDataExplorerAccount, dataExportsDataExplorerDimension, dataExportsDataExplorerTime) /* spotless:on */

        override fun toString(): String =
            when {
                dataExportsDataExplorerAccount != null ->
                    "Group{dataExportsDataExplorerAccount=$dataExportsDataExplorerAccount}"
                dataExportsDataExplorerDimension != null ->
                    "Group{dataExportsDataExplorerDimension=$dataExportsDataExplorerDimension}"
                dataExportsDataExplorerTime != null ->
                    "Group{dataExportsDataExplorerTime=$dataExportsDataExplorerTime}"
                _json != null -> "Group{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Group")
            }

        companion object {

            /** Group by account */
            @JvmStatic
            fun ofDataExportsDataExplorerAccount(
                dataExportsDataExplorerAccount: DataExportsDataExplorerAccountGroup
            ) = Group(dataExportsDataExplorerAccount = dataExportsDataExplorerAccount)

            /** Group by dimension */
            @JvmStatic
            fun ofDataExportsDataExplorerDimension(
                dataExportsDataExplorerDimension: DataExportsDataExplorerDimensionGroup
            ) = Group(dataExportsDataExplorerDimension = dataExportsDataExplorerDimension)

            /** Group by time */
            @JvmStatic
            fun ofDataExportsDataExplorerTime(
                dataExportsDataExplorerTime: DataExportsDataExplorerTimeGroup
            ) = Group(dataExportsDataExplorerTime = dataExportsDataExplorerTime)
        }

        /** An interface that defines how to map each variant of [Group] to a value of type [T]. */
        interface Visitor<out T> {

            /** Group by account */
            fun visitDataExportsDataExplorerAccount(
                dataExportsDataExplorerAccount: DataExportsDataExplorerAccountGroup
            ): T

            /** Group by dimension */
            fun visitDataExportsDataExplorerDimension(
                dataExportsDataExplorerDimension: DataExportsDataExplorerDimensionGroup
            ): T

            /** Group by time */
            fun visitDataExportsDataExplorerTime(
                dataExportsDataExplorerTime: DataExportsDataExplorerTimeGroup
            ): T

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

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(
                                    node,
                                    jacksonTypeRef<DataExportsDataExplorerAccountGroup>(),
                                )
                                ?.let { Group(dataExportsDataExplorerAccount = it, _json = json) },
                            tryDeserialize(
                                    node,
                                    jacksonTypeRef<DataExportsDataExplorerDimensionGroup>(),
                                )
                                ?.let {
                                    Group(dataExportsDataExplorerDimension = it, _json = json)
                                },
                            tryDeserialize(node, jacksonTypeRef<DataExportsDataExplorerTimeGroup>())
                                ?.let { Group(dataExportsDataExplorerTime = it, _json = json) },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from boolean).
                    0 -> Group(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<Group>(Group::class) {

            override fun serialize(
                value: Group,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.dataExportsDataExplorerAccount != null ->
                        generator.writeObject(value.dataExportsDataExplorerAccount)
                    value.dataExportsDataExplorerDimension != null ->
                        generator.writeObject(value.dataExportsDataExplorerDimension)
                    value.dataExportsDataExplorerTime != null ->
                        generator.writeObject(value.dataExportsDataExplorerTime)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Group")
                }
            }
        }

        /** Group by account */
        class DataExportsDataExplorerAccountGroup
        private constructor(
            private val groupType: JsonField<DataExplorerAccountGroup.GroupType>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("groupType")
                @ExcludeMissing
                groupType: JsonField<DataExplorerAccountGroup.GroupType> = JsonMissing.of()
            ) : this(groupType, mutableMapOf())

            fun toDataExplorerAccountGroup(): DataExplorerAccountGroup =
                DataExplorerAccountGroup.builder().groupType(groupType).build()

            /**
             * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun groupType(): Optional<DataExplorerAccountGroup.GroupType> =
                groupType.getOptional("groupType")

            /**
             * Returns the raw JSON value of [groupType].
             *
             * Unlike [groupType], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("groupType")
            @ExcludeMissing
            fun _groupType(): JsonField<DataExplorerAccountGroup.GroupType> = groupType

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
                 * Returns a mutable builder for constructing an instance of
                 * [DataExportsDataExplorerAccountGroup].
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [DataExportsDataExplorerAccountGroup]. */
            class Builder internal constructor() {

                private var groupType: JsonField<DataExplorerAccountGroup.GroupType> =
                    JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(
                    dataExportsDataExplorerAccountGroup: DataExportsDataExplorerAccountGroup
                ) = apply {
                    groupType = dataExportsDataExplorerAccountGroup.groupType
                    additionalProperties =
                        dataExportsDataExplorerAccountGroup.additionalProperties.toMutableMap()
                }

                fun groupType(groupType: DataExplorerAccountGroup.GroupType) =
                    groupType(JsonField.of(groupType))

                /**
                 * Sets [Builder.groupType] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.groupType] with a well-typed
                 * [DataExplorerAccountGroup.GroupType] value instead. This method is primarily for
                 * setting the field to an undocumented or not yet supported value.
                 */
                fun groupType(groupType: JsonField<DataExplorerAccountGroup.GroupType>) = apply {
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
                 * Returns an immutable instance of [DataExportsDataExplorerAccountGroup].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): DataExportsDataExplorerAccountGroup =
                    DataExportsDataExplorerAccountGroup(
                        groupType,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): DataExportsDataExplorerAccountGroup = apply {
                if (validated) {
                    return@apply
                }

                groupType().ifPresent { it.validate() }
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
            internal fun validity(): Int = (groupType.asKnown().getOrNull()?.validity() ?: 0)

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

                private var validated: Boolean = false

                fun validate(): GroupType = apply {
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

                    return /* spotless:off */ other is GroupType && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is DataExportsDataExplorerAccountGroup && groupType == other.groupType && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(groupType, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "DataExportsDataExplorerAccountGroup{groupType=$groupType, additionalProperties=$additionalProperties}"
        }

        /** Group by dimension */
        class DataExportsDataExplorerDimensionGroup
        private constructor(
            private val fieldCode: JsonField<String>,
            private val meterId: JsonField<String>,
            private val groupType: JsonField<DataExplorerDimensionGroup.GroupType>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("fieldCode")
                @ExcludeMissing
                fieldCode: JsonField<String> = JsonMissing.of(),
                @JsonProperty("meterId")
                @ExcludeMissing
                meterId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("groupType")
                @ExcludeMissing
                groupType: JsonField<DataExplorerDimensionGroup.GroupType> = JsonMissing.of(),
            ) : this(fieldCode, meterId, groupType, mutableMapOf())

            fun toDataExplorerDimensionGroup(): DataExplorerDimensionGroup =
                DataExplorerDimensionGroup.builder()
                    .fieldCode(fieldCode)
                    .meterId(meterId)
                    .groupType(groupType)
                    .build()

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
            fun groupType(): Optional<DataExplorerDimensionGroup.GroupType> =
                groupType.getOptional("groupType")

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
            fun _groupType(): JsonField<DataExplorerDimensionGroup.GroupType> = groupType

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
                 * Returns a mutable builder for constructing an instance of
                 * [DataExportsDataExplorerDimensionGroup].
                 *
                 * The following fields are required:
                 * ```java
                 * .fieldCode()
                 * .meterId()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [DataExportsDataExplorerDimensionGroup]. */
            class Builder internal constructor() {

                private var fieldCode: JsonField<String>? = null
                private var meterId: JsonField<String>? = null
                private var groupType: JsonField<DataExplorerDimensionGroup.GroupType> =
                    JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(
                    dataExportsDataExplorerDimensionGroup: DataExportsDataExplorerDimensionGroup
                ) = apply {
                    fieldCode = dataExportsDataExplorerDimensionGroup.fieldCode
                    meterId = dataExportsDataExplorerDimensionGroup.meterId
                    groupType = dataExportsDataExplorerDimensionGroup.groupType
                    additionalProperties =
                        dataExportsDataExplorerDimensionGroup.additionalProperties.toMutableMap()
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

                fun groupType(groupType: DataExplorerDimensionGroup.GroupType) =
                    groupType(JsonField.of(groupType))

                /**
                 * Sets [Builder.groupType] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.groupType] with a well-typed
                 * [DataExplorerDimensionGroup.GroupType] value instead. This method is primarily
                 * for setting the field to an undocumented or not yet supported value.
                 */
                fun groupType(groupType: JsonField<DataExplorerDimensionGroup.GroupType>) = apply {
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
                 * Returns an immutable instance of [DataExportsDataExplorerDimensionGroup].
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
                fun build(): DataExportsDataExplorerDimensionGroup =
                    DataExportsDataExplorerDimensionGroup(
                        checkRequired("fieldCode", fieldCode),
                        checkRequired("meterId", meterId),
                        groupType,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): DataExportsDataExplorerDimensionGroup = apply {
                if (validated) {
                    return@apply
                }

                fieldCode()
                meterId()
                groupType().ifPresent { it.validate() }
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
                (if (fieldCode.asKnown().isPresent) 1 else 0) +
                    (if (meterId.asKnown().isPresent) 1 else 0) +
                    (groupType.asKnown().getOrNull()?.validity() ?: 0)

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

                private var validated: Boolean = false

                fun validate(): GroupType = apply {
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

                    return /* spotless:off */ other is GroupType && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is DataExportsDataExplorerDimensionGroup && fieldCode == other.fieldCode && meterId == other.meterId && groupType == other.groupType && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(fieldCode, meterId, groupType, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "DataExportsDataExplorerDimensionGroup{fieldCode=$fieldCode, meterId=$meterId, groupType=$groupType, additionalProperties=$additionalProperties}"
        }

        /** Group by time */
        class DataExportsDataExplorerTimeGroup
        private constructor(
            private val frequency: JsonField<DataExplorerTimeGroup.Frequency>,
            private val groupType: JsonField<DataExplorerTimeGroup.GroupType>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("frequency")
                @ExcludeMissing
                frequency: JsonField<DataExplorerTimeGroup.Frequency> = JsonMissing.of(),
                @JsonProperty("groupType")
                @ExcludeMissing
                groupType: JsonField<DataExplorerTimeGroup.GroupType> = JsonMissing.of(),
            ) : this(frequency, groupType, mutableMapOf())

            fun toDataExplorerTimeGroup(): DataExplorerTimeGroup =
                DataExplorerTimeGroup.builder().frequency(frequency).groupType(groupType).build()

            /**
             * Frequency of usage data
             *
             * @throws M3terInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun frequency(): DataExplorerTimeGroup.Frequency = frequency.getRequired("frequency")

            /**
             * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun groupType(): Optional<DataExplorerTimeGroup.GroupType> =
                groupType.getOptional("groupType")

            /**
             * Returns the raw JSON value of [frequency].
             *
             * Unlike [frequency], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("frequency")
            @ExcludeMissing
            fun _frequency(): JsonField<DataExplorerTimeGroup.Frequency> = frequency

            /**
             * Returns the raw JSON value of [groupType].
             *
             * Unlike [groupType], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("groupType")
            @ExcludeMissing
            fun _groupType(): JsonField<DataExplorerTimeGroup.GroupType> = groupType

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
                 * Returns a mutable builder for constructing an instance of
                 * [DataExportsDataExplorerTimeGroup].
                 *
                 * The following fields are required:
                 * ```java
                 * .frequency()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [DataExportsDataExplorerTimeGroup]. */
            class Builder internal constructor() {

                private var frequency: JsonField<DataExplorerTimeGroup.Frequency>? = null
                private var groupType: JsonField<DataExplorerTimeGroup.GroupType> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(
                    dataExportsDataExplorerTimeGroup: DataExportsDataExplorerTimeGroup
                ) = apply {
                    frequency = dataExportsDataExplorerTimeGroup.frequency
                    groupType = dataExportsDataExplorerTimeGroup.groupType
                    additionalProperties =
                        dataExportsDataExplorerTimeGroup.additionalProperties.toMutableMap()
                }

                /** Frequency of usage data */
                fun frequency(frequency: DataExplorerTimeGroup.Frequency) =
                    frequency(JsonField.of(frequency))

                /**
                 * Sets [Builder.frequency] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.frequency] with a well-typed
                 * [DataExplorerTimeGroup.Frequency] value instead. This method is primarily for
                 * setting the field to an undocumented or not yet supported value.
                 */
                fun frequency(frequency: JsonField<DataExplorerTimeGroup.Frequency>) = apply {
                    this.frequency = frequency
                }

                fun groupType(groupType: DataExplorerTimeGroup.GroupType) =
                    groupType(JsonField.of(groupType))

                /**
                 * Sets [Builder.groupType] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.groupType] with a well-typed
                 * [DataExplorerTimeGroup.GroupType] value instead. This method is primarily for
                 * setting the field to an undocumented or not yet supported value.
                 */
                fun groupType(groupType: JsonField<DataExplorerTimeGroup.GroupType>) = apply {
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
                 * Returns an immutable instance of [DataExportsDataExplorerTimeGroup].
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
                fun build(): DataExportsDataExplorerTimeGroup =
                    DataExportsDataExplorerTimeGroup(
                        checkRequired("frequency", frequency),
                        groupType,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): DataExportsDataExplorerTimeGroup = apply {
                if (validated) {
                    return@apply
                }

                frequency().validate()
                groupType().ifPresent { it.validate() }
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
                (frequency.asKnown().getOrNull()?.validity() ?: 0) +
                    (groupType.asKnown().getOrNull()?.validity() ?: 0)

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

                private var validated: Boolean = false

                fun validate(): GroupType = apply {
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

                    return /* spotless:off */ other is GroupType && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is DataExportsDataExplorerTimeGroup && frequency == other.frequency && groupType == other.groupType && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(frequency, groupType, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "DataExportsDataExplorerTimeGroup{frequency=$frequency, groupType=$groupType, additionalProperties=$additionalProperties}"
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
